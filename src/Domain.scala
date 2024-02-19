import java.time.LocalDate
import java.time.Duration

type Tag = String

enum ListType:
  case Inbox, Next, Someday, Waiting, Scheduled

enum Energy:
  case Low, Medium, High

opaque type Note = String

case class Project(
    name: String,
    tags: Set[Tag],
    list: ListType,
    note: Note
)

enum ItemStatus:
  case Pending, Done

case class Item(
    name: String,
    tags: Set[Tag],
    listType: ListType,
    note: Note,
    status: ItemStatus,
    duration: Duration,
    energy: Energy,
    dueDate: LocalDate,
    project: Option[Project]
)
