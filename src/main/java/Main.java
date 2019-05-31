import org.fjala.gugumber.salesforce.entities.Contact;

/**
 * Main class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
//        contact.setSalutation("Dr.");
        contact.setLastName("pica");
//        contact.setFirstName("pedro");
        System.out.println(contact.getFullName());
    }
}
