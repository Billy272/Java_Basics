package LeetCode;

// This class implements a solution to the Decode Ciphertext problem, 
// which is a coding challenge that involves decoding a given encoded 
// text based on a specific pattern. The function takes an encoded 
// string and the number of rows used in the encoding process, and 
// it reconstructs the original message by iterating through the 
// columns of the encoded text. The decoded message is built by 
// appending characters from the appropriate positions in the 
// encoded string, and any trailing spaces are removed before 
// returning the final result. This can be useful in scenarios such 
// as data transmission, encryption/decryption tasks, or any 
// situation where you need to reverse an encoding process to 
// retrieve the original information.

public class DecodeCipherText {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder sb = new StringBuilder();

        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                int currentCol = c + r;

                if (currentCol < cols) {
                    int index = r * cols + currentCol;
                    sb.append(encodedText.charAt(index));
                }
            }
        }

        String res = sb.toString();
        int i = res.length() - 1;
        while (i >= 0 && res.charAt(i) == ' ') {
            i--;
        }

        return res.substring(0, i + 1);
    }
}
