package humans;

import bases.Human;
import utils.Dice;

// 魔法使いを表現する具象クラス
public class Wizard extends Human {

    // コンストラクタ
    public Wizard(String name, String weapon) {
    	super(name, weapon);// 【タスク①】親クラス（Human）のコンストラクタを利用して名前と武器をセットする
        
    	this.hp = Dice.get(120, 180);// 【タスク②】ヒットポイント（hp）の値を 120 〜 180 の乱数で決定してセットする
        
        // 【タスク③】攻撃力（offensive）の値を 12 〜 18 の乱数で決定してセットする
    }
}