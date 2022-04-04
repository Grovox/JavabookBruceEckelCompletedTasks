public class fifteen {
    public static void main(String[] args) {
        net.mindview.util.Stack<String> text = new net.mindview.util.Stack<String>();

        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        for (int i = 0; i < s.length(); i++) {
            char[] cs = s.toCharArray();
            if (cs[i] == '+')
                text.push(String.valueOf(cs[++i]));
            if (cs[i] == '-')
                System.out.println(text.peek());
        }
    }
}
