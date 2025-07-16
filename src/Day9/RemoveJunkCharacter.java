package Day9;

public class RemoveJunkCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="we#lc&om--e";
		
		System.out.println(s.replace("#", "").replace("&", "").replace("-", ""));
		System.out.println(s.replaceAll("[#&-]", ""));

	}

}
