package myproject1;
//correct
public class arrayvowels {
	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c', 'e', 'f', 'g', 'i', 'j', 'o', 'u', 'k' };
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.print(ch[i]+" ");
			//} else {
				//System.out.print(ch[i]);
			}
		}
	}
}
