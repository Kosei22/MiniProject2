public class Contact {

    private String name;
    private String mobile;
    private String work;
    private String home;
    private String city;

    public Contact(String name, String mobile, String work, String home, String city){
        this.name = name;
        this.mobile = mobile;
        this.work = work;
        this.home = home;
        this.city = city;
    }

    @Override
    public String toString() {
        if(work.isEmpty() && home.isEmpty() && city.isEmpty()){
            return String.format("<%s> (mobile=%s)", name, mobile);
        }if(work.isEmpty() && home.isEmpty()){
            return String.format("<%s> (mobile=%s, city=%s)", name, mobile, city);
        }if (work.isEmpty() && city.isEmpty()){
            return String.format("<%s> (mobile=%s, home=%s)", name, mobile, home);
        }if(home.isEmpty() && city.isEmpty()){
            return String.format("<%s> (mobile=%s, work=%s)", name, mobile, work);
        }if(work.isEmpty()) {
             return String.format("<%s> (mobile=%s, home=%s, city=%s)", name, mobile, home, city);
        }if(home.isEmpty()){
            return String.format("<%s> (mobile=%s, work=%s, city=%s)", name, mobile, work, city);
        }if(city.isEmpty()){
            return String.format("<%s> (mobile=%s, work=%s, home=%s)", name, mobile, work, home);
        }
        return String.format("<%s> (mobile=%s, work=%s, home=%s, city=%s)", name, mobile, work, home, city);
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getHome() {
        return home;
    }

    public String getCity() {
        return city;
    }
}
