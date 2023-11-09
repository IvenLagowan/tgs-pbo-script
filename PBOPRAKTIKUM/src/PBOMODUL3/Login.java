package PBOMODUL3;
public class Login {
private String nama, pass;
public Login() { 
    this.nama = "yubis"; this.pass = "123";
}
public Login(String nama, String pass) { 
    this.nama = nama;
this.pass = pass;
}
public String getName() { 
    return nama;
}
public void setName(String nama) { 
    this.nama = nama;
}
public String getPass() { 
    return pass;
}


public void setPass(String pass) { this.pass = pass;
}
}
