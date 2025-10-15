package model.statements;

import exception.MyException;
import model.PrgState;
import model.types.BoolType;
import model.types.IType;
import model.values.BoolValue;
import model.values.IValue;

public class IfStmt implements IStmt {
    private Exp exp;
    private  IStmt thenS;
    private IStmt elseS;

    public IfStmt(Exp exp, IStmt thenS, IStmt elseS) {
        this.exp=exp;
        this.thenS=thenS;
        this.elseS=elseS;
    }
    public String toString(){
        return "if("+exp+"){"+thenS+"}else{"+elseS+"}";
    }
    public PrgState execute(PrgState state) throws MyException{
       IValue val = exp.execute();
       if(val.getType().equals(new BoolType())){
           BoolValue b=(BoolValue)val;
           if(b.getVal()==true){
               state.getExeStack().push(thenS);
           }
           else
           {
               state.getExeStack().push(elseS);
           }
       }
       else {
           throw new MyException("The condition is not boolean type.");
       }
    }
}
