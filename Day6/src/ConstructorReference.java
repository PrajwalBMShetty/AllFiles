
public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messagable hello=Message::new;
		hello.getMessage("Hello");

	}

}
