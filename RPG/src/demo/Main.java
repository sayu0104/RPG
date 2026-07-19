package demo;

import java.util.ArrayList;
import java.util.List;

import bases.Human;
import bases.Monster;
import humans.Brave;
import humans.Fighter;
import humans.Wizard;
import utils.Dice;

public class Main {
    public static void main(String[] args) {
        System.out.println("★★ ==== 戦いの開始だ！！ ==== ★★");

        // 【タスク①】人間グループの各インスタンスを生成する
        // 仕様：Braveは「沖田総司/剣」、Fighterは「金太郎/斧」、Wizardは「安倍晴明/魔法」
        Brave brave = new Brave("沖田総司", "剣");
        Fighter fighter = new Fighter("金太郎", "斧");
        Wizard wizard = new Wizard("安倍晴明", "魔法");
        
        // 人間グループのリストを空で生成
        List<Human> humans = new ArrayList<>();
        
        // 【タスク②】生成した勇者、戦士、魔法使いを人間グループのリストに追加する
        humans.add(brave);
        humans.add(fighter);
        humans.add(wizard);
        
        // 【タスク③】モンスターグループの各インスタンスを生成する
        // 仕様：Slimeは「キングスライム/体当たり」、Oakは「オークキング/槍」、Dragonは「紅龍/炎」
        
        
        // モンスターグループのリストを空で生成
        List<Monster> monsters = new ArrayList<>();
        
        // 【タスク④】生成したスライム、オーク、ドラゴンをモンスターグループのリストに追加する
        

        // 現在の各グループの状態を一覧表示
        showGroupInfos(humans, monsters);

        // --- ここから下はStep 5で実装するため、まだ触りません ---
        /*
        int count = 1;
        while (true) {
            // 戦闘ループ（後ほど実装）
            break; 
        }
        */
    }

    // 引数でもらった人間グループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
    public static Human choiceHuman(List<Human> humans) {
        Human human = humans.get(Dice.get(0, humans.size() - 1));
        System.out.printf("人間グループから 「%s」 のお出ましだ！\n", human.getName());
        return human;
    }

    // 引数でもらったモンスターグループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
    public static Monster choiceMonster(List<Monster> monsters) {
        Monster monster = monsters.get(Dice.get(0, monsters.size() - 1));
        System.out.printf("モンスターグループから 「%s」 のお出ましだ！\n", monster.getName());
        return monster;
    }

    // 引数でもらった人間グループリストとモンスターグループリストのそれぞれの情報一覧を表示するメソッド
    public static void showGroupInfos(List<Human> humans, List<Monster> monsters) {
        System.out.println("\n## === グループ情報 === ##");
        System.out.printf("# [人間グループ]: %d人\n", humans.size());
        for (Human human : humans) {
            System.out.println(human);
        }
        System.out.printf("\n# [モンスターグループ]: %d人\n", monsters.size());
        for (Monster monster : monsters) {
            System.out.println(monster);
        }
    }
}