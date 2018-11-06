package com.netcracker.first;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {}

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        String str = new String("Author[name=" + name + ",email=" + email + ",gender=" + gender + "]");
        return str;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Author)) {
            return false;
        }

        Author author = (Author) obj;

        boolean result = author.name.equals(this.name) & author.email.equals(this.email) & author.gender == this.gender;
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + (int)gender;

        return result;
    }
}
