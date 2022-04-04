import shape.*;

public class Nine_Ten {
    public static void main(String[] args) {
        Playable[] orchestra = {
                new Brass(),
                new Woodwind(),
        };
        Music music = new Music();
        music.tuneALL(orchestra);
    }
}

