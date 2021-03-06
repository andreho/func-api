package net.andreho.func;

/**
 * <br/>Created by a.hofmann on 02.07.2017 at 19:47.
 */
@FunctionalInterface
public interface V9<A, B, C, D, E, F, G, H, I>
  extends VN,
          Bindable<A, V8<B, C, D, E, F, G, H, I>> {

  @Override
  default V8<B, C, D, E, F, G, H, I> bind(final A target) {
    return (b, c, d, e, f, g, h, i) ->
      call(target, (B) b, (C) c, (D) d, (E) e, (F) f, (G) g, (H) h, (I) i);
  }

  /**
   * @param result
   * @param <R>
   * @return
   */
  default <R> F9<R,A,B,C,D,E,F,G,H,I> toFunc(final R result) {
    return (a, b, c, d, e, f, g, h, i) -> {
      call(a, b, c, d, e, f, g, h, i);
      return result;
    };
  }

  /**
   * @param args
   */
  default void call(Object... args) {
    call((A) args[0],
         (B) args[1],
         (C) args[2],
         (D) args[3],
         (E) args[4],
         (F) args[5],
         (G) args[6],
         (H) args[7],
         (I) args[8]);
  }

  /**
   * @param a
   * @param b
   * @param c
   * @param d
   * @param e
   * @param f
   * @param g
   * @param h
   * @param i
   */
  void call(A a,
            B b,
            C c,
            D d,
            E e,
            F f,
            G g,
            H h,
            I i);
}
