package com.examples.singamnist;

/**
 * Created by AdminCOOP on 8/23/2016.
 */
public class singa_wrap implements singa_wrapConstants {
    public static long Product(Shape shape, int start, long len) {
        return singa_wrapJNI.Product__SWIG_0(Shape.getCPtr(shape), shape, start, len);
    }

    public static long Product(Shape shape, int start) {
        return singa_wrapJNI.Product__SWIG_1(Shape.getCPtr(shape), shape, start);
    }

    public static long Product(Shape shape) {
        return singa_wrapJNI.Product__SWIG_2(Shape.getCPtr(shape), shape);
    }

    public static long SizeOf(DataType t) {
        return singa_wrapJNI.SizeOf(t.swigValue());
    }

    public static void CopyDataToFrom(Tensor dst, Tensor src, long num, long src_offset, long dst_offset) {
        singa_wrapJNI.CopyDataToFrom__SWIG_0(Tensor.getCPtr(dst), dst, Tensor.getCPtr(src), src, num, src_offset, dst_offset);
    }

    public static void CopyDataToFrom(Tensor dst, Tensor src, long num, long src_offset) {
        singa_wrapJNI.CopyDataToFrom__SWIG_1(Tensor.getCPtr(dst), dst, Tensor.getCPtr(src), src, num, src_offset);
    }

    public static void CopyDataToFrom(Tensor dst, Tensor src, long num) {
        singa_wrapJNI.CopyDataToFrom__SWIG_2(Tensor.getCPtr(dst), dst, Tensor.getCPtr(src), src, num);
    }

    public static Tensor Reshape(Tensor in, Shape s) {
        return new Tensor(singa_wrapJNI.Reshape(Tensor.getCPtr(in), in, Shape.getCPtr(s), s), true);
    }

    public static Tensor Abs(Tensor t) {
        return new Tensor(singa_wrapJNI.Abs(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Exp(Tensor t) {
        return new Tensor(singa_wrapJNI.Exp(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Log(Tensor t) {
        return new Tensor(singa_wrapJNI.Log(Tensor.getCPtr(t), t), true);
    }

    public static Tensor ReLU(Tensor t) {
        return new Tensor(singa_wrapJNI.ReLU(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Sigmoid(Tensor t) {
        return new Tensor(singa_wrapJNI.Sigmoid(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Sign(Tensor t) {
        return new Tensor(singa_wrapJNI.Sign(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Sqrt(Tensor t) {
        return new Tensor(singa_wrapJNI.Sqrt(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Square(Tensor t) {
        return new Tensor(singa_wrapJNI.Square(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Tanh(Tensor t) {
        return new Tensor(singa_wrapJNI.Tanh(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Sum(Tensor t, int axis) {
        return new Tensor(singa_wrapJNI.Sum(Tensor.getCPtr(t), t, axis), true);
    }

    public static float floatSum(Tensor t) {
        return singa_wrapJNI.floatSum(Tensor.getCPtr(t), t);
    }

    public static Tensor Average(Tensor t, int axis) {
        return new Tensor(singa_wrapJNI.Average(Tensor.getCPtr(t), t, axis), true);
    }

    public static Tensor SoftMax(Tensor t) {
        return new Tensor(singa_wrapJNI.SoftMax__SWIG_0(Tensor.getCPtr(t), t), true);
    }

    public static Tensor Pow(Tensor base, Tensor exp) {
        return new Tensor(singa_wrapJNI.Pow__SWIG_0(Tensor.getCPtr(base), base, Tensor.getCPtr(exp), exp), true);
    }

    public static void Pow(Tensor base, Tensor exp, Tensor out) {
        singa_wrapJNI.Pow__SWIG_1(Tensor.getCPtr(base), base, Tensor.getCPtr(exp), exp, Tensor.getCPtr(out), out);
    }

    public static Tensor Pow_f(Tensor in, float x) {
        return new Tensor(singa_wrapJNI.Pow_f(Tensor.getCPtr(in), in, x), true);
    }

    public static void Pow_f_out(Tensor in, float x, Tensor out) {
        singa_wrapJNI.Pow_f_out(Tensor.getCPtr(in), in, x, Tensor.getCPtr(out), out);
    }

    public static Tensor LT_TT(Tensor lhs, Tensor rhs) {
        return new Tensor(singa_wrapJNI.LT_TT(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs), true);
    }

    public static Tensor LE_TT(Tensor lhs, Tensor rhs) {
        return new Tensor(singa_wrapJNI.LE_TT(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs), true);
    }

    public static Tensor GT_TT(Tensor lhs, Tensor rhs) {
        return new Tensor(singa_wrapJNI.GT_TT(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs), true);
    }

    public static Tensor GE_TT(Tensor lhs, Tensor rhs) {
        return new Tensor(singa_wrapJNI.GE_TT(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs), true);
    }

    public static Tensor LT_Tf(Tensor t, float x) {
        return new Tensor(singa_wrapJNI.LT_Tf(Tensor.getCPtr(t), t, x), true);
    }

    public static Tensor LE_Tf(Tensor t, float x) {
        return new Tensor(singa_wrapJNI.LE_Tf(Tensor.getCPtr(t), t, x), true);
    }

    public static Tensor GT_Tf(Tensor t, float x) {
        return new Tensor(singa_wrapJNI.GT_Tf(Tensor.getCPtr(t), t, x), true);
    }

    public static Tensor GE_Tf(Tensor t, float x) {
        return new Tensor(singa_wrapJNI.GE_Tf(Tensor.getCPtr(t), t, x), true);
    }

    public static Tensor Add_TT(Tensor lhs, Tensor rhs) {
        return new Tensor(singa_wrapJNI.Add_TT(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs), true);
    }

    public static Tensor Sub_TT(Tensor lhs, Tensor rhs) {
        return new Tensor(singa_wrapJNI.Sub_TT(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs), true);
    }

    public static Tensor EltwiseMul_TT(Tensor lhs, Tensor rhs) {
        return new Tensor(singa_wrapJNI.EltwiseMul_TT(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs), true);
    }

    public static Tensor Div_TT(Tensor lhs, Tensor rhs) {
        return new Tensor(singa_wrapJNI.Div_TT(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs), true);
    }

    public static Tensor Add_Tf(Tensor t, float x) {
        return new Tensor(singa_wrapJNI.Add_Tf(Tensor.getCPtr(t), t, x), true);
    }

    public static Tensor Sub_Tf(Tensor t, float x) {
        return new Tensor(singa_wrapJNI.Sub_Tf(Tensor.getCPtr(t), t, x), true);
    }

    public static Tensor EltwiseMul_Tf(Tensor t, float x) {
        return new Tensor(singa_wrapJNI.EltwiseMul_Tf(Tensor.getCPtr(t), t, x), true);
    }

    public static Tensor Div_Tf(Tensor t, float x) {
        return new Tensor(singa_wrapJNI.Div_Tf(Tensor.getCPtr(t), t, x), true);
    }

    public static void Add(Tensor lhs, Tensor rhs, Tensor ret) {
        singa_wrapJNI.Add(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs, Tensor.getCPtr(ret), ret);
    }

    public static void Sub(Tensor lhs, Tensor rhs, Tensor ret) {
        singa_wrapJNI.Sub(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs, Tensor.getCPtr(ret), ret);
    }

    public static void EltwiseMult(Tensor lhs, Tensor rhs, Tensor ret) {
        singa_wrapJNI.EltwiseMult(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs, Tensor.getCPtr(ret), ret);
    }

    public static void Div(Tensor lhs, Tensor rhs, Tensor ret) {
        singa_wrapJNI.Div(Tensor.getCPtr(lhs), lhs, Tensor.getCPtr(rhs), rhs, Tensor.getCPtr(ret), ret);
    }

    public static void Add_Tf_out(Tensor t, float x, Tensor ret) {
        singa_wrapJNI.Add_Tf_out(Tensor.getCPtr(t), t, x, Tensor.getCPtr(ret), ret);
    }

    public static void Sub_Tf_out(Tensor t, float x, Tensor ret) {
        singa_wrapJNI.Sub_Tf_out(Tensor.getCPtr(t), t, x, Tensor.getCPtr(ret), ret);
    }

    public static void EltwiseMult_Tf_out(Tensor t, float x, Tensor ret) {
        singa_wrapJNI.EltwiseMult_Tf_out(Tensor.getCPtr(t), t, x, Tensor.getCPtr(ret), ret);
    }

    public static void Div_Tf_out(Tensor t, float x, Tensor ret) {
        singa_wrapJNI.Div_Tf_out(Tensor.getCPtr(t), t, x, Tensor.getCPtr(ret), ret);
    }

    public static void floatBernoulli(float p, Tensor out) {
     singa_wrapJNI.floatBernoulli(p, Tensor.getCPtr(out), out);
    }

    public static void floatGaussian(float mean, float std, Tensor out) {
         singa_wrapJNI.floatGaussian(mean, std, Tensor.getCPtr(out), out);
    }

    public static void floatUniform(float low, float high, Tensor out) {
        singa_wrapJNI.floatUniform(low, high, Tensor.getCPtr(out), out);
    }

    public static void floatAxpy(float alpha, Tensor in, Tensor out) {
        singa_wrapJNI.floatAxpy(alpha, Tensor.getCPtr(in), in, Tensor.getCPtr(out), out);
    }

    public static Tensor Mult(Tensor A, Tensor B) {
        return new Tensor(singa_wrapJNI.Mult__SWIG_0(Tensor.getCPtr(A), A, Tensor.getCPtr(B), B), true);
    }

    public static void Mult(Tensor A, Tensor B, Tensor C) {
        singa_wrapJNI.Mult__SWIG_1(Tensor.getCPtr(A), A, Tensor.getCPtr(B), B, Tensor.getCPtr(C), C);
    }

    public static void floatMult(float alpha, Tensor A, Tensor B, float beta, Tensor C) {
        singa_wrapJNI.floatMult(alpha, Tensor.getCPtr(A), A, Tensor.getCPtr(B), B, beta, Tensor.getCPtr(C), C);
    }

    public static void AddColumn(Tensor v, Tensor M) {
        singa_wrapJNI.AddColumn(Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void floatAddColumn(float alpha, float beta, Tensor v, Tensor M) {
        singa_wrapJNI.floatAddColumn(alpha, beta, Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void AddRow(Tensor v, Tensor M) {
        singa_wrapJNI.AddRow(Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void floatAddRow(float alpha, float beta, Tensor v, Tensor M) {
        singa_wrapJNI.floatAddRow(alpha, beta, Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void DivColumn(Tensor v, Tensor M) {
        singa_wrapJNI.DivColumn(Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void DivRow(Tensor v, Tensor M) {
        singa_wrapJNI.DivRow(Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void MultColumn(Tensor v, Tensor M) {
        singa_wrapJNI.MultColumn(Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void MultRow(Tensor v, Tensor M) {
        singa_wrapJNI.MultRow(Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void SubColumn(Tensor v, Tensor M) {
        singa_wrapJNI.SubColumn(Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void SubRow(Tensor v, Tensor M) {
        singa_wrapJNI.SubRow(Tensor.getCPtr(v), v, Tensor.getCPtr(M), M);
    }

    public static void SumColumns(Tensor M, Tensor v) {
        singa_wrapJNI.SumColumns(Tensor.getCPtr(M), M, Tensor.getCPtr(v), v);
    }

    public static void SumRows(Tensor M, Tensor v) {
        singa_wrapJNI.SumRows(Tensor.getCPtr(M), M, Tensor.getCPtr(v), v);
    }

    public static void SoftMax(Tensor in, Tensor out) {
        singa_wrapJNI.SoftMax__SWIG_1(Tensor.getCPtr(in), in, Tensor.getCPtr(out), out);
    }

    public static Layer CreateLayer(String type) {
        long cPtr = singa_wrapJNI.CreateLayer(type);
        return (cPtr == 0) ? null : new Layer(cPtr, true);
    }

    public static strVector GetRegisteredLayers() {
        return new strVector(singa_wrapJNI.GetRegisteredLayers(), true);
    }

    public static Optimizer CreateOptimizer(String type) {
        long cPtr = singa_wrapJNI.CreateOptimizer(type);
        return (cPtr == 0) ? null : new Optimizer(cPtr, true);
    }

    public static Constraint CreateConstraint(String type) {
        long cPtr = singa_wrapJNI.CreateConstraint(type);
        return (cPtr == 0) ? null : new Constraint(cPtr, true);
    }

    public static Regularizer CreateRegularizer(String type) {
        long cPtr = singa_wrapJNI.CreateRegularizer(type);
        return (cPtr == 0) ? null : new Regularizer(cPtr, true);
    }

}

