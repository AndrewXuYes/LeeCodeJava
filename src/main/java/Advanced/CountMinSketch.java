package Advanced;

public class CountMinSketch {
    /**
     * 为什么要用Sketch
     * 网络流主要根据五元组、主机地址、包的大小来分类。在网络中存在各种各样的包，如果按照上述分类方法，对每一种包都分配一个计数器来储存，虽然测量准确，
     * 那么存放计数器的空间开销会非常大。所以使用哈希的方法，根据哈希值的范围来确定的所需的存储空间，各种包根据哈希值再次归类，可以大大减少存储空间。
     * 这样使用哈希来估计流的方法称为Sketch-based方法。
     *
     * https://www.cnblogs.com/vancasola/p/9457423.html
     */

}
