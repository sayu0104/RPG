package monsters;

import bases.Monster;

// スライムを表現する具象クラス
public class Slime extends Monster {

    // コンストラクタ
    public Slime(String name, String weapon) {
    	super(name, weapon);// 【タスク①】親クラス（Monster）のコンストラクタを利用して名前と武器をセットする
        
        // 【タスク②】ヒットポイント（hp）の値を 70 〜 130 の乱数で決定してセットする
        
        // 【タスク③】攻撃力（offensive）の値を 5 〜 11 の乱数で決定してセットする
    }
}