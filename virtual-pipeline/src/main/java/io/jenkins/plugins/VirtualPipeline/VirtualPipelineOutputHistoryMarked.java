package io.jenkins.plugins.VirtualPipeline;

public class VirtualPipelineOutputHistoryMarked extends VirtualPipelineLineOutput{
    public HistoryType getHistoryType() {
        return historyType;
    }

    private final HistoryType historyType;

    public VirtualPipelineOutputHistoryMarked(String regex, String line, int index, Boolean deleteMark, LineType type, HistoryType historyType, long lineOffset, Boolean display) {
        super(regex, line, index, deleteMark, type, lineOffset, display);
        this.historyType = historyType;
    }
}