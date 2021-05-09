import axios from 'axios';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/request';

type ChartData = {

    labels: string[];
    series: number[];
}

const DonutChart = () => {

    let chartData: ChartData = { labels: [], series: [] };

    console.log("Passei aqui");
    axios.get(`${BASE_URL}/sales/sum-by-seller`)
        .then(response => {
            console.log(response.data);
            console.log("Passei aqui 2");
            const data = response.data as SaleSum[];
            const myLabels = data.map(x => x.name);
            const mySeries = data.map(x => x.sum);

            chartData = { labels: myLabels, series: mySeries }
            //chartData = { labels: myLabels, series: mySeries}
            console.log(chartData)
        });
    //    const mockData = {
    //        series: [477138, 499928, 444867, 220426, 473088],
    //        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    //    }

    const options = {
        legend: {
            show: true
        }
    }

    return (

        <Chart
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height="240"
        />

    );
}

export default DonutChart;