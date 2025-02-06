public class Main {
  public static void main(String[] args) {
    //Compression
    String input = ""; //use empty input if not provided one in console
    String output = "";
    if (args.length > 0) //can use function argument to input string in console (ex.: java Main aaabb)
      input = args[0];
    
    char prev = '\0'; //at i = 0, previous character is null
    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      char current = input.charAt(i);
      if (current == prev || prev == '\0') { //when the i-th character matches the previous one, increase count
        count++;
      } else {
        output = output + prev + count; //add result to output (ex.: '\0' + 'a' + 3 = "a3")
        count = 1; //reset the counter for different character
      }
      prev = current; //assign previous value since loop iteration is ending;
    }
    if (input.length() > 0) output = output + prev + count; //add the last iteration to output
    System.out.println("Compression:");
    System.out.printf("\"%s\" -> \"%s\"", input, output);
    System.out.println();
    //Decompression
    String decompInput = output;
    String decompOutput = "";
    for (int i = 0; i < decompInput.length(); i+=2) {
      String letter = "" + decompInput.charAt(i);
      int number = decompInput.charAt(i+1) - 48; //subtract 48, to convert ascii numbers into actual number values
      decompOutput += letter.repeat(number);
    }
    System.out.println("Decompression:");
    System.out.printf("\"%s\" -> \"%s\"", decompInput, decompOutput);
  }
}