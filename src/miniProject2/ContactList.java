package miniProject2;

import java.util.ArrayList;

/**
 *
 */
public class ContactList {
  ArrayList <Contact> list;

  public ContactList(ArrayList<Contact> list) {
    this.list = list;
  }

  public ContactList() {
    this.list = new ArrayList<>();
    Contact c = new Contact();
    c.setName("Derrick");
    c.setMobile("012-345-678");
    c.setCity("Vancouver");
    this.list.add(c);
  }

  public void addContact(Contact newContact){
  }

}
