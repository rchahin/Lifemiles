
public interface Iencoder {

	
	
	
	public static void main(String[] args)
	{

	//store the all the alphabet in an array
	char[] alfa = { 'a', 'b', 'c', 'd', 'e', 'f',
	'g', 'h', 'i', 'j', 'k', 'l',
	'm', 'n', 'o', 'p', 'q', 'r',
	's', 't', 'u', 'v', 'w', 'x',
	'y', 'z', '1', '2', '3', '4',
	'5', '6', '7', '8', '9', '0' };

	String[] morse
	= { ".-",   "-...", "-.-.", "-..",  ".",
	"..-.", "--.",  "....", "..",   ".---",
	"-.-",  ".-..", "--",   "-.",   "---",
	".--.", "--.-", ".-.",  "...",  "-",
	"..-",  "...-", ".--",  "-..-", "-.--",
	"--..", "|" };

	String[] binario
	= { "01100001",   "01100010", "01100011", "01100100",  "01100101",
	"01100110", "01100111",  "01101000", "01101001",   "01101010",
	"01101011",  "01101100", "01101101",   "01101110",   "01101111",
	"01110000", "01110001", "01110010",  "01110011",  "01110100",
	"01110101",  "01110101", "01110110",  "01110111", "01111001",
	"01111010", "|" };

	String[] murcielago
	= { "7",   "", "3", "",  "5",
	"", "8",  "", "4",   "",
	"",  "6", "0",   "",   "9",
	"", "", "2",  "",  "",
	"1",  "", "",  "", "",
	"", "|" };

		
	String texto = "ricardo";

	Morse(morse, texto, alfa);
	Binario(binario, texto, alfa);
	Murcielago(murcielago, texto, alfa);
	}

	public static void Morse(String[] morse,
            String texto,
            char[] letter)
{
System.out.print("Codigo Morse " + texto + " ");
for (int i = 0; i < texto.length(); i++) {
for (int j = 0; j < letter.length; j++) {
if (texto.charAt(i) == letter[j]) {
System.out.print(morse[j] + " ");
break;
}
}
}
}

	public static void Binario(String[] binario,
            String texto,
            char[] letter)
{
System.out.print("Codigo Binario " + texto + " ");
for (int i = 0; i < texto.length(); i++) {
for (int j = 0; j < letter.length; j++) {
if (texto.charAt(i) == letter[j]) {
System.out.print(binario[j] + " ");
break;
}
}
}
}

	public static void Murcielago(String[] murcielago,
            String texto,
            char[] letter)
{
System.out.print("Codigo Murcielago " + texto+ " ");
for (int i = 0; i < texto.length(); i++) {
for (int j = 0; j < letter.length; j++) {
if (texto.charAt(i) == letter[j]) {
System.out.print(murcielago[j] + " ");
break;
}
}
}
}
	
	
}
