package com.yepro12.compiler2017.Table;
public class ArrayType extends VariableType{
        public Type dataType;
        public ArrayType(Type dataType){
            this.type = TheType.ARRAY;
            this.dataType = dataType;
        }

        @Override
        public boolean isSame(Type arg){
            if (arg.type != TheType.ARRAY) return false;
            if (arg.type == TheType.NULL) return true;
            return dataType.isSame((ArrayType)arg);
        }

}