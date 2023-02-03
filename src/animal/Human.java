package animal;

public class Human extends Animal implements Thinkable {
    private String hobby; // 趣味

    // 引数なしコンストラクタ
    public Human() {

    }

    // 引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    @Override
    // thinkメソッド
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


}
