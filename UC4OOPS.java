public class UC4OOPS {

    public static void main(String[] args) {

        // Store banner lines in a String array
        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*", "*        *", "    *"),
            String.join(" ", "*   *", "*", "*        *", "    *"),
            String.join(" ", "*****", "*", "*****", "*****")
        };

        // Loop through array and print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}