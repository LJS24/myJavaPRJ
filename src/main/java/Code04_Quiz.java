public class Code04_Quiz {
    public static void main(String[] args) {

        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"http://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)\"";
        String str;
        System.out.println(log.indexOf(" "));

        System.out.println(log.substring(0, log.indexOf(" ")));

        System.out.println(log.indexOf("-"));

        int a = log.indexOf("\"");
        /* 백슬래시 따옴표를 먼저 찾아서 범위를 잡아야 했던 것.*/
        int b = log.indexOf(" /", a);     /*뒤에 나오는 게 시작점인 것을 명심하자. 헷갈리면 망함*/

        System.out.println(log.substring(a+1, b)); /*큰따옴표 다음 굴자부터 찾기 위해 a+1을 한 것이다. */




/* ip 확인 및 처리에 관해 필수적인 기초지식이므로 필히 숙달할 것. */
    }
}
