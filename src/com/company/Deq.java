package com.company;

//Непрерывная реализация дека.
class Deq{
    private final static int DEFSIZE = 16;
    protected R2Point[] array;
    private int size, head, tail;
    private  int startS;
    public Deq(int size){
        startS = size;
        array = new R2Point[size];
        this.size = head = 0;
        tail = array.length - 1;
    }

    public Deq(){
        this(DEFSIZE);
    }

    public  boolean has(){
        return size>0;
    }
    private int forward(int index){
        return ++index < array.length ? index : 0;
    }

    private int backward(int index){
        return --index >= 0 ? index : array.length - 1;
    }

    public int length(){
        return size;
    }

    public void pushFront(R2Point p){
        array[head = backward(head)] = p;
        size += 1;
    }

    public void pushBack(R2Point p){
        array[tail = forward(tail)] = p;
        size += 1;
    }

    public R2Point popFront(){

        R2Point p = front();
        head = forward(head);
        size -= 1;
        return p;
    }

    public R2Point popBack(){
        R2Point p = back();
        tail = backward(tail);
        size -= 1;
        return p;
    }

    @Override
    protected Deq clone() {
        Deq f = new Deq(startS);
        for(int i = 0;i<startS;i++){
            f.array[i] = array[i];
        }
        f.tail = tail;
        f.head = head;
        f.size = size;
        return f;
    }

    public R2Point front(){
        return array[head];
    }

    public R2Point back(){
        return array[tail];
    }
}