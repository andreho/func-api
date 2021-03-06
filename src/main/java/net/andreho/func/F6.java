package net.andreho.func;

/**
 * <br/>Created by a.hofmann on 02.07.2017 at 19:47.
 */
@FunctionalInterface
public interface F6<R,A,B,C,D,E,F> extends FN<R>, Bindable<A,F5<R,B,C,D,E,F>> {
  @Override
  default F5<R,B,C,D,E,F> bind(final A target) {
    return (b,c,d,e,f) ->
      call(target, (B) b, (C) c, (D) d, (E) e, (F) f);
  }

  /**
   * @param args
   * @return
   */
  default R call(Object... args) {
    return call((A) args[0], (B) args[1], (C) args[2], (D) args[3], (E) args[4], (F) args[5]);
  }

  /**
   * @param a
   * @param b
   * @param c
   * @param d
   * @param e
   * @param f
   * @return
   */
  R call(A a, B b, C c, D d, E e, F f);
}
