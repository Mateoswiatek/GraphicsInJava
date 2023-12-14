package elements;

import java.util.ArrayList;
import java.util.List;

public class TreeBranch {
    public List<Branch> branches = new ArrayList<>();
    public TreeBranch addBranch(Branch branch){
        branches.add(branch);
        return this;
    }
    public TreeBranch addBranch(List<Branch> branch){
        branches.addAll(branch);
        return this;
    }

    public List<Branch> getBranches() {
        return branches;
    }
}
