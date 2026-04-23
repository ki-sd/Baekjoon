class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLenSec = timeToSeconds(video_len);
        int posSec = timeToSeconds(pos);
        int opStartSec = timeToSeconds(op_start);
        int opEndSec = timeToSeconds(op_end);
        
        if (posSec >= opStartSec && posSec <= opEndSec) {
            posSec = opEndSec;
        }
        
        for(int i=0;i<commands.length;i++){
            if(commands[i].equals("prev")){
                posSec-=10;
                if(posSec<0)
                    posSec=0;
            }
            else if(commands[i].equals("next")){
                posSec+=10;
                if (posSec > videoLenSec)
                    posSec = videoLenSec;
            }
            if (posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }
        }
        return String.format("%02d:%02d", posSec / 60, posSec % 60);
    }
    private int timeToSeconds(String time) {
        String[] t = time.split(":");
        int min = Integer.parseInt(t[0]);
        int sec = Integer.parseInt(t[1]);
        return (min * 60) + sec;
    }
}