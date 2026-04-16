public class HistoryManager {

    private List<String> history = new ArrayList<>(;

    public void addRecord(String record) {
        history.add(record);
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("No history yet.");
            return;
        }
    }
}
