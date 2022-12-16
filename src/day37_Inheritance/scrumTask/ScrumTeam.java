package day37_Inheritance.scrumTask;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner po;
    public BusinessAnalyst ba;
    public ScrumMaster sm;



    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner po, BusinessAnalyst ba, ScrumMaster sm) {
        this.po = po;
        this.ba = ba;
        this.sm = sm;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testers.removeIf(p-> p.id == id);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDevelopers(int id){
        developers.removeIf(p-> p.id == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + po.name +
                ", BA=" + ba.name +
                ", SM=" + sm.name +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
