import { Link } from "react-router-dom"
import Footer from "../../components/Footer"
import NavBar from "../../components/NavBar"

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <br></br>
                    <br></br>
                    <br></br>
                    <h1 className="display-4">RHVO Vendas</h1>
                    <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back-end construído com Spring Boot.</p>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Acessar Dashboard
                    </Link>
                </div>
            </div>
            <Footer />
        </>
    )
}

export default Home
