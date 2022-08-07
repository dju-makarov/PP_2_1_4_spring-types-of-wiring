package koschei.models;

public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return "есть остров, на том острове " + wood.toString();
    }
}
