
final case class Name(name: String)

// Expression
sealed trait EOExpr[+A]

// Object
sealed case class EOObj[+A](
  freeAttrs: Vector[Name],
  varargAttr: Option[Name],
  bndAttrs: Vector[EOBndExpr[A]],
) extends EOExpr[A]

// Application
sealed trait EOApp[+A] extends EOExpr[A]

sealed case class EOSimpleApp[+A](
    name: String
) extends EOApp[A]

sealed case class EOSimpleAppWithLocator[+A](
  name: String,
  locator: Int
) extends EOApp[A]

sealed case class EODot[+A](
  src: A,
  name: String
) extends EOApp[A]

sealed case class EOCopy[+A](
  trg: A,
  args: NonEmptyVector[EOBnd[A]]
) extends EOApp[A]
