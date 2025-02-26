import java.util.Vector;

class BrowserHistory {
    Vector<String> mv = new Vector<>();
    int cur;
    
    public BrowserHistory(String homepage) {
        cur = 0;
        mv.add(homepage);
    }
    
    public void visit(String url) {
        for(int i = mv.size()-1; i > cur; i--) {
            mv.remove(i);
        }
        mv.add(url);
        cur++;
    }
    
    public String back(int steps) {
        cur = Math.max(0, cur - steps);
        return mv.get(cur);
    }
    
    public String forward(int steps) {
        cur = Math.min(mv.size() - 1, cur + steps);
        return mv.get(cur);
    }
}