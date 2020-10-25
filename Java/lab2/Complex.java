public class Complex {
    double re;
    double im;
    double abs()
    {
        return Math.sqrt(re*re+im*im);
    }
    void add(Complex that)
    {
        re+= that.re;
        im+= that.im;
    }
    void sub(Complex that)
    {
        re-= that.re;
        im-= that.im;
    }
    void mul(Complex that)
    {
        double new_re = this.re*that.re - this.im*that.im;
        double new_im = this.im*that.re + this.re*that.im;
        re = new_re;
        im = new_im;
    }
     
}