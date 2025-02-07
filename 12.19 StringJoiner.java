import java.util.StringJoiner;

class MAIN {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr   = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/","[","]");
        for(String s : arr)
            sj.add(s);

        String a = "a", b = "b", c = "c";
        System.out.println(sj.toString());
        System.out.println(String.join(" || ",animals, a, b, c));
    }
}
