import java.lang.reflect.Field;

class ClassHandlerTwo{
    private Class c;
    private int tabulator = 0;

    ClassHandlerTwo (Class c){
        this.c = c;
    }

    public void hierarchySearch (){
        System.out.println("Name -> " + c.getName());

        if(c.getDeclaredFields().length !=0){
            DeclaredFieldsOut(c);
        }

        if (c.getInterfaces().length != 0){
            tabulator++;
            this.InterfaceClassOut(c);
        }

        if (c.getSuperclass() != null){
            tabulator++;
            this.SuperclassOut(c);
        }

    }
    private void DeclaredFieldsOut(Class classProcessing){
        for(int i = 0; i < tabulator;i++){
            System.out.print("  ");
        }
        System.out.println("DeclaredFields:");
        for(Field field : classProcessing.getDeclaredFields()){
            for(int i = 0; i < tabulator;i++){
                System.out.print("  ");
            }
            System.out.println("-> " + field);
        }
    }

    private void InterfaceClassOut(Class classProcessing){
        for (Class Interface : classProcessing.getInterfaces()){
            for(int i = 0; i < tabulator;i++){
                System.out.print("  ");
            }
            System.out.println("Interface " + classProcessing.getName()
                    + " -> " + Interface.getName());
            if(Interface.getDeclaredFields().length !=0){
                DeclaredFieldsOut(Interface);
            }
            if (Interface.getInterfaces().length != 0){
                tabulator++;
                this.InterfaceClassOut(Interface);
            }
        }
        tabulator--;
    }


    private void SuperclassOut(Class classProcessing){
        Class Superclass = classProcessing.getSuperclass();
        for(int i = 0; i < tabulator;i++){
            System.out.print("  ");
        }
        System.out.println("Superclass " + classProcessing.getName()
                + " -> " + Superclass.getName());

        if(Superclass.getDeclaredFields().length !=0){
            DeclaredFieldsOut(Superclass);
        }

        if (Superclass.getInterfaces().length != 0){
            tabulator++;
            this.InterfaceClassOut(Superclass);
        }

        if (Superclass.getSuperclass() != null){
            tabulator++;
            this.SuperclassOut(Superclass);
        }

        tabulator --;
    }

}

public class Nine {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("The argument for creating the class was not entered\nor there are more than one arguments!!!");
            System.exit(0);
        }
        Class classIn = null;
        try {
            classIn = Class.forName(args[0]);
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn't find " + args[0]);
            System.exit(0);
        }
        ClassHandlerTwo classHandlerTwo = new ClassHandlerTwo(classIn);
        classHandlerTwo.hierarchySearch();

    }
}
