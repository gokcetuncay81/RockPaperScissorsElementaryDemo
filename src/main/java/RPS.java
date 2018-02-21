
public class RPS {

    public int solution(char defaultGesture, String gestures) {
        char winCondition;
        char looseCondition;
        int result = 0;

        if (defaultGesture =='P'){
            winCondition = 'R';
            looseCondition = 'S';
        }
        else if (defaultGesture =='R'){
            winCondition = 'S';
            looseCondition = 'P';
        }
        else {
            winCondition = 'P';
            looseCondition = 'R';
        }

        char[] charsOfGestures = gestures.toCharArray();

        for (char c: charsOfGestures){
            if (c == defaultGesture) {
                result += 1;
            }
            else if (c == winCondition) {
                result +=2;
            }
            else if (c == looseCondition) {
                result += 0;
            }
        }

        return result;
    }



}
