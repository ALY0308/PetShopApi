package domain;

public class OwnerDomain {
    private Integer idOwner;
    private String nameOwner;
    private String last_nameOwner;
    private String emailOwner;
    private Integer phoneOwner;
    private String addressOwner;


    public Integer getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Integer idOwner) {
        this.idOwner = idOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getLast_nameOwner() {
        return last_nameOwner;
    }

    public void setLast_nameOwner(String last_nameOwner) {
        this.last_nameOwner = last_nameOwner;
    }

    public String getEmailOwner() {
        return emailOwner;
    }

    public void setEmailOwner(String emailOwner) {
        this.emailOwner = emailOwner;
    }

    public Integer getPhoneOwner() {
        return phoneOwner;
    }

    public void setPhoneOwner(Integer phoneOwner) {
        this.phoneOwner = phoneOwner;
    }

    public String getAddressOwner() {
        return addressOwner;
    }

    public void setAddressOwner(String addressOwner) {
        this.addressOwner = addressOwner;
    }
}
