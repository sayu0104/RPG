package monsters;

import bases.Monster;
import utils.Dice;

// オークを表現する具象クラス
public class Oak extends Monster {

    // コンストラクタ
    public Oak(String name, String weapon) {
    	super(name, weapon);// 【タスク①】親クラス（Monster）のコンストラクタを利用して名前と武器をセットする
        
    	this.hp = Dice.get(170, 230);// 【タスク②】ヒットポイント（hp）の値を 170 〜 230 の乱数で決定してセットする
        
        // 【タスク③】攻撃力（offensive）の値を 9 〜 15 の乱数で決定してセットする
    }
}