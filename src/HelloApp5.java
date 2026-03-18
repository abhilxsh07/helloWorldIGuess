public class HelloApp5 {
    public static void main(String[] args) {
        String nameText;

        if (args.length == 0) {
            nameText = "World";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String name : args) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(name);
            }
            nameText = sb.toString();
        }

        System.out.println("Hello, " + nameText + "!");
    }
}