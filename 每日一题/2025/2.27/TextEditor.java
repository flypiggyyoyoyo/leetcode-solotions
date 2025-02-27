class TextEditor {

    StringBuilder str;
    int cnt;

    public TextEditor() {
        str = new StringBuilder();
        cnt = 0;
    }

    public void addText(String text) {
        str.insert(cnt, text);
        cnt += text.length();
    }

    public int deleteText(int k) {
        int nums = Math.min(k, cnt);
        str.delete(cnt - nums, cnt);
        cnt = cnt - nums;
        return nums;
    }

    public String cursorLeft(int k) {
        cnt = Math.max(0, cnt - k);
        return str.substring(Math.max(0, cnt - 10), cnt);
    }

    public String cursorRight(int k) {
        cnt = Math.min(cnt + k, str.length());
        return str.substring(Math.max(0, cnt - 10), cnt);
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */