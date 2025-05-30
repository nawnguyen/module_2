package ss16.BaiTap.readFile;

class Country {
    private int id;
    private String code;
    private String name;

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Code: " + code + ", Name: " + name;
    }
}
