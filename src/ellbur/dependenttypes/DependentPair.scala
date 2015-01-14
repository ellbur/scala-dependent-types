
package ellbur.dependenttypes

trait DependentPair[A <: Depender] {
  val car: A
  val cdr: car.T

  def toAnyPair: (A, Any) = (car, cdr)

  override def toString = s"($car, $cdr)"
}
