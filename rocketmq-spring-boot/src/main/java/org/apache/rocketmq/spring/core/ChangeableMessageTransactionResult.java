package org.apache.rocketmq.spring.core;

import org.apache.rocketmq.common.message.Message;

/**
 * 事务commit
 * @author duanziyu
 */
public class ChangeableMessageTransactionResult {
    private Message message;
    private boolean isChange=false;
    private RocketMQLocalTransactionState state;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public RocketMQLocalTransactionState getState() {
        return state;
    }

    public void setState(RocketMQLocalTransactionState state) {
        this.state = state;
    }

    public boolean isChange() {
        return isChange;
    }

    public void setChange(boolean change) {
        isChange = change;
    }

    @Override
    public String toString() {
        return "ChangeableMessageTransactionResult{" +
                "message=" + message +
                ", isChange=" + isChange +
                ", state=" + state +
                '}';
    }
}
