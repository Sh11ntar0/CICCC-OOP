package miniProject2;

/**
 * organized by a ContactList object.
 */
public class Contact {
  private String name;
  private String mobile;
  private String city;
  private String work;
  private String home;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  @Override
  public String toString() {
    return
        "<" + name + "> (mobile=" + mobile + ", city=" + city + ", work=" + work + ", home=" + home + ")";
  }
}

