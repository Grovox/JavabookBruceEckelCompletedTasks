package Class.Six;
import interfacce.Six.*;
public class Text{
    protected class outText implements text{
        @Override
        public Object print() {
            return outText.this;
        }
    }
    public text text123(){
        return new outText();
    }
}
