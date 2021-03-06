package eu.leads.crawler.concurrent;

/**
 *  abstract Task implementation. {@code getSequenceName} returns {@code null}.
 */
public abstract class BaseTask implements Task {

    public String getSequenceName() {
        return null;
    }
}
