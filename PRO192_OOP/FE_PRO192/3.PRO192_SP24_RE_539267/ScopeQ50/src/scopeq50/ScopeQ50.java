/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scopeq50;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Base{
    public void amethod(int i){}
}

public class ScopeQ50 extends Base{

//    void amethod(int i) throws Exception{}
//must declare as public and do not throw Exception
    void amethod(long i) throws Exception{}
    void amethod(long i){}
//    public void amethod(int i) throws Exception{}
//super method do not throw Exception, so subMethod do not throw Exception
    
    public static void main(String[] args) {
    }
}
