package com.njuse.seecjvm.instructions.comparison;

import com.njuse.seecjvm.instructions.base.BranchInstruction;
import com.njuse.seecjvm.runtime.StackFrame;

public abstract class IF_ICMPCOND extends BranchInstruction {
    /**
     * TODO：实现这条指令
     * 其中，condition 方法是对具体条件的计算，当条件满足时返回true，否则返回false
     */
    @Override
    public void execute(StackFrame frame) {
        int v1=frame.getOperandStack().popInt();
        int v2=frame.getOperandStack().popInt();
        if(condition(v2,v1)){
            int branchPC=frame.getNextPC()-3+this.offset;
            frame.setNextPC(branchPC);
        }
    }
    protected abstract boolean condition(int v1, int v2);
}
