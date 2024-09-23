
package system;

/**
 *
 * @author Lenovo
 */
class User {
    private int u_id;
    private String u_fname ,u_lname , u_uname, u_bdate, u_address;
   
    public User (int aw1, String fname, String lname, String birthdate, String address)
    {
        this.u_id=u_id;
        this.u_fname=u_fname;
        this.u_lname=u_lname;
        this.u_uname=u_uname;
        this.u_bdate=u_bdate;
        this.u_address=u_address;
        
    }

    User(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getu_id(){
    return u_id;
    }
    public String getu_fname(){
        return u_fname;
    }
    public String getu_lname(){
        return u_lname;
    }
    public String getu_uname(){
        return u_uname;
    }
    public String getu_bdate(){
        return u_bdate;
    }
    public String getu_address(){
        return u_address;
    }
}
