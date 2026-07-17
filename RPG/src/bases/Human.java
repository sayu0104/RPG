package bases;

import utils.Dice;

// 人間を表現する抽象クラス
public abstract class Human extends Living {

    // コンストラクタ
    public Human(String name, String weapon) {
       super(name,weapon); // 【タスク①】Livingクラスで定義したコンストラクタを利用する
    }

    // attackメソッドのオーバーライド
    @Override
    public void attack(Living target) {
        int damage = offensive * Dice.get(1,10);// 【タスク②】1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
        
        target.setHp(target.getHp() - damage);// 【タスク③】相手のHPをダメージ値だけ減らす
        
        setOffensive(getOffensive() - 1);// 【タスク④】自分の攻撃力を1だけ減らす
        
        System.out.println("「" + this.name + "」が「" + this.weapon + "」で攻撃！「" + target.getName() + "」に" + damage + "のダメージを与えた。");
        System.out.println("しかし自分の攻撃力も1減少した。");// 【タスク⑤】コンソールにステータスを表示する
    }
}