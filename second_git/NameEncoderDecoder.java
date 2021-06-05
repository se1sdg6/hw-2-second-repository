class NameEncoderDecoder {
    public String encode(String name) {
        name = name
                .replaceAll("e", "1")
                .replaceAll("u", "2")
                .replaceAll("i", "3")
                .replaceAll("o", "4")
                .replaceAll("a", "5");

        name = "NOTFORYOU" + name + "YESNOTFORYOU";

        return name;
    }

    public String decode(String name) {
        name = name
                .replaceAll("1", "e")
                .replaceAll("2", "u")
                .replaceAll("3", "i")
                .replaceAll("4", "o")
                .replaceAll("5", "a");

        name = name.replace("YESNOTFORYOU", "");
        name = name.replace("NOTFORYOU", "");

        return name;
    }
}